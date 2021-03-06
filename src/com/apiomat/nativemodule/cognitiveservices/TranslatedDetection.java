/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.cognitiveservices;


import com.apiomat.nativemodule.basics.*;
/**
* Generated class for your TranslatedDetection data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "CognitiveServices",
    hooksClassNameTransient = "com.apiomat.nativemodule.cognitiveservices.TranslatedDetectionHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.cognitiveservices.TranslatedDetectionHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class TranslatedDetection extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.cognitiveservices.TranslatedDetection> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.cognitiveservices.TranslatedDetection>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "CognitiveServices";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "TranslatedDetection";

    /** class specific attributes */
    private java.util.List<String> detections = new java.util.ArrayList<>();
    private java.util.List<String> translations = new java.util.ArrayList<>();
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public TranslatedDetection ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public java.util.List<String> getDetections()
    {
         return this.detections;
    }

    public void setDetections( java.util.List<String> arg )
    {
        this.detections = arg;
    }

    public java.util.List<String> getTranslations()
    {
         return this.translations;
    }

    public void setTranslations( java.util.List<String> arg )
    {
        this.translations = arg;
    }

}
