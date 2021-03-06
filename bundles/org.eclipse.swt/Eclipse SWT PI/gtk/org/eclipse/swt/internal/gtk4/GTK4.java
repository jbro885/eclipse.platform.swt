/*******************************************************************************
 * Copyright (c) 2021 Syntevo and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Syntevo - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.gtk4;

/**
 * This class contains native functions that are present in GTK4 only.
 */
public class GTK4 {
	/**
	 * @param context cast=(GtkIMContext *)
	 * @param event cast=(GdkEvent *)
	 */
	public static final native boolean gtk_im_context_filter_keypress(long context, long event);
}
