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

package org.openflexo.module.javamodule.view;

import javax.swing.ImageIcon;

import org.openflexo.rm.ResourceLocator;
import org.openflexo.toolbox.ImageIconResource;

public class JAVIconLibrary {

	public static final ImageIcon JAV_SMALL_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/module-jav-16.png"));
	public static final ImageIcon JAV_MEDIUM_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/module-jav-32.png"));
	public static final ImageIcon JAV_MEDIUM_ICON_HOVER = new ImageIconResource(
			ResourceLocator.locateResource("Icons/module-jav-hover-32.png"));
	public static final ImageIcon JAV_BIG_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/module-jav-64.png"));

}
