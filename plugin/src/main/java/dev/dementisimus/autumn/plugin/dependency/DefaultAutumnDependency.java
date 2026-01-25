package dev.dementisimus.autumn.plugin.dependency;

import dev.dementisimus.autumn.api.dependency.AutumnDependency;
import io.papermc.paper.plugin.loader.library.impl.MavenLibraryResolver;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class DefaultAutumnDependency implements AutumnDependency {

    private DefaultRepository repository = new DefaultRepository("maven-central", MavenLibraryResolver.MAVEN_CENTRAL_DEFAULT_MIRROR);
    private DefaultArtifact artifact;

    @Override
    public String toString() {
        return this.repository.getId() + ":" + this.artifact.getArtifactId() + "-" + this.artifact.getVersion();
    }

    @Data
    @AllArgsConstructor
    static class DefaultRepository implements Repository {

        private String id;
        private String url;
    }

    @Data
    static class DefaultArtifact implements Artifact {

        private String groupId;
        private String artifactId;
        private String version;
    }
}
