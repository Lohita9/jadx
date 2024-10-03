/**
 * Precompiled [jadx-rewrite.gradle.kts][Jadx_rewrite_gradle] script plugin.
 *
 * @see Jadx_rewrite_gradle
 */
public
class JadxRewritePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Jadx_rewrite_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
