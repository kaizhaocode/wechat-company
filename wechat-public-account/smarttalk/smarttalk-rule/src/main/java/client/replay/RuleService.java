package client.replay;

import cc.pp.rpc.domain.Result;

/**
 * 智能对话服务类，用于获取智能回复相关的数据
 * @author wgybzb
 * @since  2013-05-22
 *
 */
public interface RuleService {
	/**
	 * 设置用到的域名，方便手动改变接口的域名
	 * 例如测试环境是可以手动指定
	 * @param host
	 */
	public void setHost(String host);

   /**
     * 通过用户ID和规则库ID
     * 获取当前自定义规则库下的所有规则
     *
     * @param uid 		用户id
     * @param replyid 	规则库ID
     *
     * @return         所有规则列表
     */
    Result ruleList(int uid, int replyid);

    /**
     * 按用户提供的关键词，获取关键词的回复内容
     *
     * @param uid 		用户id
     * @param replyid 	规则库ID
     *
     * @return 		    关键词的回复内容
     */
    Result search(int uid, String text);
}
