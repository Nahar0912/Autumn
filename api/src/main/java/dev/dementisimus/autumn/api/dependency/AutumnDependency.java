/*
 | Copyright 2022 dementisimus,
 | licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License. 
 |
 | To view a copy of this license,
 | visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 */

package dev.dementisimus.autumn.api.dependency;

/**
 * @since 1.0.0
 */
public interface AutumnDependency {

    Repository getRepository();

    Artifact getArtifact();

    /**
     * Creates a readable and short version of repositoryId:artifactId-version
     * Example: maven-central:Autumn-1.0.0
     *
     */
    String toString();

    interface Repository {

        String getId();

        String getUrl();
    }

    interface Artifact {

        String getGroupId();

        String getArtifactId();

        String getVersion();
    }
}
