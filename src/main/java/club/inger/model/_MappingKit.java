package club.inger.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("collect", "id", Collect.class);
		arp.addMapping("comment", "id", Comment.class);
		arp.addMapping("news", "id", News.class);
		arp.addMapping("news_logs", "id", NewsLogs.class);
		arp.addMapping("news_modules", "id", NewsModules.class);
		arp.addMapping("recommendations", "id", Recommendations.class);
		arp.addMapping("reply", "id", Reply.class);
		arp.addMapping("users", "id", Users.class);
		arp.addMapping("zan", "id", Zan.class);
	}
}

