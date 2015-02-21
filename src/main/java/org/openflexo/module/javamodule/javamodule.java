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

package org.openflexo.module.javamodule;

import org.openflexo.module.Module;
import org.openflexo.module.javamodule.view.JAVIconLibrary;

public class javamodule extends Module<JAVModule> {

	public static Module<JAVModule> INSTANCE = null;

	public javamodule() {

		super(JAVModule.JAV_MODULE_NAME, JAVModule.JAV_MODULE_NAME, JAVModule.class, JAVPreferences.class, "", null, "JAV",
				JAVIconLibrary.JAV_SMALL_ICON, JAVIconLibrary.JAV_MEDIUM_ICON, JAVIconLibrary.JAV_MEDIUM_ICON_HOVER,
				JAVIconLibrary.JAV_BIG_ICON);

		INSTANCE = this;
	}

}
