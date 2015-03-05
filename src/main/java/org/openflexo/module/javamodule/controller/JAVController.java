/*
 * (c) Copyright 2014- Openflexo
 *
 * This file is part of OpenFlexo.
 *
 * OpenFlexo is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenFlexo is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenFlexo. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.openflexo.module.javamodule.controller;

import org.openflexo.foundation.FlexoObject;
import org.openflexo.foundation.FlexoProject;
import org.openflexo.foundation.technologyadapter.TechnologyAdapter;
import org.openflexo.module.FlexoModule;
import org.openflexo.module.javamodule.view.menu.JAVMenuBar;
import org.openflexo.selection.MouseSelectionManager;
import org.openflexo.technologyadapter.java.JAVATechnologyAdapter;
import org.openflexo.view.FlexoMainPane;
import org.openflexo.view.controller.FlexoController;
import org.openflexo.view.controller.TechnologyAdapterController;
import org.openflexo.view.menu.FlexoMenuBar;

public class JAVController extends FlexoController {

	public JAVController(FlexoModule module) {
		super(module);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initializePerspectives() {
		for (TechnologyAdapter ta : getApplicationContext().getTechnologyAdapterService().getTechnologyAdapters()) {
			if (ta instanceof JAVATechnologyAdapter) {
				TechnologyAdapterController<?> tac = getApplicationContext().getTechnologyAdapterControllerService()
						.getTechnologyAdapterController(ta);
				if (tac != null) {
					tac.installTechnologyPerspective(this);
				}
			}
		}

	}

	@Override
	protected MouseSelectionManager createSelectionManager() {
		return new JAVSelectionManager(this);
	}

	@Override
	protected FlexoMenuBar createNewMenuBar() {
		return new JAVMenuBar(this);
	}

	@Override
	public FlexoObject getDefaultObjectToSelect(FlexoProject project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected FlexoMainPane createMainPane() {
		// TODO Auto-generated method stub
		return new FlexoMainPane(this);
	}

	// @Override
	// public void objectWasDoubleClicked(Object object) {
	// if (object instanceof FlexoResource<?>) {
	// if (((FlexoResource<?>) object).isLoadable() && !((FlexoResource<?>) object).isLoaded()) {
	//
	// LoadResourceAction action = LoadResourceAction.actionType.makeNewAction((FlexoResource<?>) object, null, getEditor());
	// action.doAction();
	// }
	// else {
	// selectAndFocusObjectAsTask((FlexoObject) ((FlexoResource<?>) object).getLoadedResourceData());
	// }
	// }
	//
	// if (object instanceof RepositoryFolder<?>) {
	// RepositoryFolder<JAVAResource> repository = (RepositoryFolder<JAVAResource>) object;
	// JAVARepositoryView repositoryView = new JAVARepositoryView(repository);
	// }
	// }
}
