/*
 * Copyright (c) UChicago Argonne, LLC. All rights reserved.
 * See LICENSE file.
 */
package gov.anl.aps.cdb.portal.plugins.support.traveler.objects;

import java.util.LinkedList;

/**
 *
 * @author djarosz
 */
public class Form extends TravelerObject {
    private String html; 
    private String title;
    private String createdBy; 
    private String createdOn; 
    private LinkedList<SharedGroup> sharedGroup; 
    private LinkedList<SharedWith> sharedWith; 
    private String updatedBy; 
    private String updatedOn; 

    public String getHtml() {
        return html;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public LinkedList<SharedGroup> getSharedGroup() {
        return sharedGroup;
    }

    public LinkedList<SharedWith> getSharedWith() {
        return sharedWith;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }
    
    
}
