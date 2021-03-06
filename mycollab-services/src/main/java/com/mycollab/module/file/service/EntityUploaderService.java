/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.file.service;

import java.awt.image.BufferedImage;

/**
 * @author MyCollab Ltd
 * @since 5.2.12
 */
public interface EntityUploaderService {
    /**
     * @param logo
     * @param basePath
     * @param oldId
     * @param uploadedUser
     * @param sAccountId
     * @param preferSizes
     * @return
     */
    String upload(BufferedImage logo, String basePath, String oldId, String uploadedUser, Integer sAccountId, int[] preferSizes);
}
