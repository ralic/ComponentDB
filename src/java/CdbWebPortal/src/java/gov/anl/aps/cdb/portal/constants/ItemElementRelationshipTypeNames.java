/*
 * Copyright (c) UChicago Argonne, LLC. All rights reserved.
 * See LICENSE file.
 */
package gov.anl.aps.cdb.portal.constants;

public enum ItemElementRelationshipTypeNames {
        itemLocation("Location");

        private String value;

        private ItemElementRelationshipTypeNames(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    };
