/*******************************************************************************
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * Contributors:
 *               Kamesh Sampath - initial implementation
 *******************************************************************************/

package com.liferay.ide.portlet.core.display.model;

import com.liferay.ide.portlet.core.model.internal.PortletNamePossibleValueService;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.Image;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.annotations.Service;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

/**
 * @author Kamesh Sampath
 */
@Image( path = "images/elcl16/portlet_16x16.png" )
public interface DisplayPortlet extends Element
{
    ElementType TYPE = new ElementType( DisplayPortlet.class );

    // *** Id ***

    @Label( standard = "Id" )
    @XmlBinding( path = "@id" )
    @Required
    @Service( impl = PortletNamePossibleValueService.class )
    ValueProperty PROP_ID = new ValueProperty( TYPE, "Id" ); //$NON-NLS-1$

    Value<String> getId();

    void setId( String id );

}
