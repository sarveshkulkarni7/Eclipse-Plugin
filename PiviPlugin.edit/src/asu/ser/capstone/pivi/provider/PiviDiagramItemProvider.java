/**
 */
package asu.ser.capstone.pivi.provider;


import asu.ser.capstone.pivi.PiviDiagram;
import asu.ser.capstone.pivi.PiviFactory;
import asu.ser.capstone.pivi.PiviPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link asu.ser.capstone.pivi.PiviDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PiviDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS);
			childrenFeatures.add(PiviPackage.Literals.PIVI_DIAGRAM__START);
			childrenFeatures.add(PiviPackage.Literals.PIVI_DIAGRAM__INPUT_PORT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PiviDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PiviDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PiviDiagram_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PiviDiagram.class)) {
			case PiviPackage.PIVI_DIAGRAM__STATEMENTS:
			case PiviPackage.PIVI_DIAGRAM__START:
			case PiviPackage.PIVI_DIAGRAM__INPUT_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createIfEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createIfStart()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createMethodEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createMethodStart()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createWhileEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createWhileStart()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createThreadEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createThreadStart()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__STATEMENTS,
				 PiviFactory.eINSTANCE.createPrintStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__START,
				 PiviFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(PiviPackage.Literals.PIVI_DIAGRAM__INPUT_PORT,
				 PiviFactory.eINSTANCE.createInputPort()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PiviEditPlugin.INSTANCE;
	}

}
