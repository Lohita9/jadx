/**
 * Precompiled [jadx-java.gradle.kts][Jadx_java_gradle] script plugin.
 *
 * @see Jadx_java_gradle
 */
public
class JadxJavaPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Jadx_java_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
