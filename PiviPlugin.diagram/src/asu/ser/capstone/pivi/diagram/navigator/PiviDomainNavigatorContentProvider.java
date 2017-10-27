	package asu.ser.capstone.pivi.diagram.navigator;

	/**
 * @generated
 */
public class PiviDomainNavigatorContentProvider implements org.eclipse.ui.navigator.ICommonContentProvider {

		/**
 * @generated
 */
private org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider myAdapterFctoryContentProvier;

		/**
 * @generated
 */
private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
 * @generated
 */
private org.eclipse.jface.viewers.Viewer myViewer;

	/**
 * @generated
 */
private org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain myEditingDomain;

	/**
 * @generated
 */
private org.eclipse.emf.workspace.util.WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
 * @generated
 */
private Runnable myViewerRefreshRunnable;
	
		/**
 * @generated
 */
public PiviDomainNavigatorContentProvider() {
	myAdapterFctoryContentProvier = new org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider(asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
	org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory.INSTANCE.createEditingDomain();
myEditingDomain = (org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain) editingDomain;
myEditingDomain.setResourceToReadOnlyMap(new java.util.HashMap() {
	public Object get(Object key) {
		if (!containsKey(key)) {
			put(key, Boolean.TRUE);
		}
		return super.get(key);
	}
});
myViewerRefreshRunnable = new Runnable() {
	public void run() {
		if (myViewer != null) {
			myViewer.refresh();
		}
	}
};
myWorkspaceSynchronizer = new org.eclipse.emf.workspace.util.WorkspaceSynchronizer(editingDomain, new org.eclipse.emf.workspace.util.WorkspaceSynchronizer.Delegate() {
	public void dispose() {
	}

	public boolean handleResourceChanged(final org.eclipse.emf.ecore.resource.Resource resource) {
		unloadAllResources();
asyncRefresh();
return true;
	}
	
	public boolean handleResourceDeleted(org.eclipse.emf.ecore.resource.Resource resource) {
		unloadAllResources();
asyncRefresh();
return true;
	}
	
	public boolean handleResourceMoved(org.eclipse.emf.ecore.resource.Resource resource, final org.eclipse.emf.common.util.URI newURI) {
		unloadAllResources();
asyncRefresh();
return true;
	}
});
}

		/**
 * @generated
 */
public void dispose() {
	myWorkspaceSynchronizer.dispose();
	myWorkspaceSynchronizer = null;
	myViewerRefreshRunnable = null;
	myViewer = null;
	unloadAllResources();
	((org.eclipse.emf.transaction.TransactionalEditingDomain) myEditingDomain).dispose();
	myEditingDomain = null;
}
	
		/**
 * @generated
 */
public void inputChanged(org.eclipse.jface.viewers.Viewer viewer, Object oldInput, Object newInput) {
	myViewer = viewer;
}
	
	
	/**
 * @generated
 */
	void unloadAllResources() {
		for (org.eclipse.emf.ecore.resource.Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}
	
	/**
 * @generated
 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}
	
	/**
 * @generated
 */
public Object[] getElements(Object inputElement) {
	return getChildren(inputElement);
}
	
	/**
 * @generated
 */
public void restoreState(org.eclipse.ui.IMemento aMemento) {
}

/**
 * @generated
 */
public void saveState(org.eclipse.ui.IMemento aMemento) {
}
    
    /**
 * @generated
 */
public void init(org.eclipse.ui.navigator.ICommonContentExtensionSite aConfig) {
}
    
    		/**
 * @generated
 */
public Object[] getChildren(Object parentElement) {
	if (parentElement instanceof org.eclipse.core.resources.IFile) {
		org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) parentElement;
org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
org.eclipse.emf.ecore.resource.Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
		return wrapEObjects(myAdapterFctoryContentProvier.getChildren(resource), parentElement);
	}
	
	if (parentElement instanceof asu.ser.capstone.pivi.diagram.navigator.PiviDomainNavigatorItem) {
		return wrapEObjects(myAdapterFctoryContentProvier.getChildren(((asu.ser.capstone.pivi.diagram.navigator.PiviDomainNavigatorItem) parentElement).getEObject()), parentElement);
	}
	return EMPTY_ARRAY;
}
	
		/**
 * @generated
 */
public Object[] wrapEObjects(Object[] objects, Object parentElement) {
	java.util.Collection result = new java.util.ArrayList();
	for (int i = 0; i < objects.length; i++) {
		if (objects[i] instanceof org.eclipse.emf.ecore.EObject) {
			result.add(new asu.ser.capstone.pivi.diagram.navigator.PiviDomainNavigatorItem((org.eclipse.emf.ecore.EObject) objects[i], parentElement, myAdapterFctoryContentProvier));
		}
	}
	return result.toArray();
}
	
	/**
 * @generated
 */
public Object getParent(Object element) {
	if (element instanceof asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem) {
    	asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem abstractNavigatorItem = (asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem) element;
		return abstractNavigatorItem.getParent();
	}
	return null;
}
	
	/**
 * @generated
 */
public boolean hasChildren(Object element) {
	return element instanceof org.eclipse.core.resources.IFile || getChildren(element).length > 0;
}
    
    }
