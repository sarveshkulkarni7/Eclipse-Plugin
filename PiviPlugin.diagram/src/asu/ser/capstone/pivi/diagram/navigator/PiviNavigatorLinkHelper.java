	package asu.ser.capstone.pivi.diagram.navigator;

	/**
 * @generated
 */
public class PiviNavigatorLinkHelper implements org.eclipse.ui.navigator.ILinkHelper {

	/**
 * @generated
 */
private static org.eclipse.ui.IEditorInput getEditorInput(org.eclipse.gmf.runtime.notation.Diagram diagram) {
	org.eclipse.emf.ecore.resource.Resource diagramResource = diagram.eResource();
	for (org.eclipse.emf.ecore.EObject nextEObject : diagramResource.getContents()) {
		if (nextEObject == diagram) {
			return new org.eclipse.ui.part.FileEditorInput(org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(diagramResource));
		}
		if (nextEObject instanceof org.eclipse.gmf.runtime.notation.Diagram) {
			break;
		}
	}
	org.eclipse.emf.common.util.URI uri = org.eclipse.emf.ecore.util.EcoreUtil.getURI(diagram);
String editorName = uri.lastSegment() + '#' + diagram.eResource().getContents().indexOf(diagram);
org.eclipse.ui.IEditorInput editorInput = new org.eclipse.emf.common.ui.URIEditorInput(uri, editorName);
	return editorInput;
}

		/**
 * @generated
 */
public org.eclipse.jface.viewers.IStructuredSelection findSelection(org.eclipse.ui.IEditorInput anInput) {
	org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument document = asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().getDocumentProvider().getDiagramDocument(anInput);
		if (document == null) {
	return org.eclipse.jface.viewers.StructuredSelection.EMPTY;
}
org.eclipse.gmf.runtime.notation.Diagram diagram = document.getDiagram();
if (diagram == null || diagram.eResource() == null) {
	return org.eclipse.jface.viewers.StructuredSelection.EMPTY;
}
org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(diagram.eResource());
if (file != null) {
		asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem item = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem(diagram, file, false);
		return new org.eclipse.jface.viewers.StructuredSelection(item);
}
	return org.eclipse.jface.viewers.StructuredSelection.EMPTY;
}
	
		/**
 * @generated
 */
public void activateEditor(org.eclipse.ui.IWorkbenchPage aPage, org.eclipse.jface.viewers.IStructuredSelection aSelection) {
	if (aSelection == null || aSelection.isEmpty()) {
		return;
	}
	if (false == aSelection.getFirstElement() instanceof asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem) {
		return;
	}
		
	asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem abstractNavigatorItem = (asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem) aSelection.getFirstElement();
	org.eclipse.gmf.runtime.notation.View navigatorView = null;
	if (abstractNavigatorItem instanceof asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem) {
		navigatorView = ((asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem) abstractNavigatorItem).getView();
	} else if (abstractNavigatorItem instanceof asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup) {
		asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup navigatorGroup = (asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup) abstractNavigatorItem;
		if (navigatorGroup.getParent() instanceof asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem) {
			navigatorView = ((asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem) navigatorGroup.getParent()).getView();
		}		}
	if (navigatorView == null) {
		return;
	}
	org.eclipse.ui.IEditorInput editorInput = getEditorInput(navigatorView.getDiagram());
	org.eclipse.ui.IEditorPart editor = aPage.findEditor(editorInput);
	if (editor == null) {
		return;
	}
	aPage.bringToTop(editor);
	if (editor instanceof org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor) {
		org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor diagramEditor = (org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor) editor;
		org.eclipse.emf.ecore.resource.ResourceSet diagramEditorResourceSet = diagramEditor.getEditingDomain().getResourceSet();
		org.eclipse.emf.ecore.EObject selectedView = diagramEditorResourceSet.getEObject(org.eclipse.emf.ecore.util.EcoreUtil.getURI(navigatorView), true);	
		if (selectedView == null) {
			return;
		}
		org.eclipse.gef.GraphicalViewer graphicalViewer = (org.eclipse.gef.GraphicalViewer) diagramEditor.getAdapter(org.eclipse.gef.GraphicalViewer.class);
		org.eclipse.gef.EditPart selectedEditPart = (org.eclipse.gef.EditPart) graphicalViewer.getEditPartRegistry().get(selectedView);
		if (selectedEditPart != null) {
			graphicalViewer.select(selectedEditPart);
		}
	}
}
	
	}
