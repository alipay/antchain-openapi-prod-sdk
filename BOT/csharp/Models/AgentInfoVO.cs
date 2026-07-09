// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 智能体信息视图对象
    public class AgentInfoVO : TeaModel {
        // 智能体ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7265889323732762624</para>
        /// </summary>
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 智能体名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>小蚁</para>
        /// </summary>
        [NameInMap("agent_name")]
        [Validation(Required=true)]
        public string AgentName { get; set; }

        // 语言编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>zh</para>
        /// </summary>
        [NameInMap("lang_code")]
        [Validation(Required=true)]
        public string LangCode { get; set; }

        // 音色ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>longjing_v2</para>
        /// </summary>
        [NameInMap("tts_voice_id")]
        [Validation(Required=true)]
        public string TtsVoiceId { get; set; }

        // 系统提示词
        /// <summary>
        /// <b>Example:</b>
        /// <para>你是一个某某智能体</para>
        /// </summary>
        [NameInMap("system_prompt")]
        [Validation(Required=true)]
        public string SystemPrompt { get; set; }

        // 可选模型列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;label&quot;:&quot;qwen-plus&quot;,&quot;value&quot;:&quot;qwen-plus&quot;},{&quot;label&quot;:&quot;glm4.7&quot;,&quot;value&quot;:&quot;glm4.7&quot;},{&quot;label&quot;:&quot;glm5&quot;,&quot;value&quot;:&quot;glm5&quot;}]</para>
        /// </summary>
        [NameInMap("llm_model_list")]
        [Validation(Required=false)]
        public List<DictionaryInfoBO> LlmModelList { get; set; }

        // 可选音色列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;label&quot;:&quot;甜甜（女声普通话）&quot;,&quot;value&quot;:&quot;Tina&quot;},{&quot;label&quot;:&quot;拉迪奥·戈尔（男声葡萄牙语）&quot;,&quot;value&quot;:&quot;Radio Gol&quot;}]</para>
        /// </summary>
        [NameInMap("tts_voice_list")]
        [Validation(Required=false)]
        public List<DictionaryInfoBO> TtsVoiceList { get; set; }

        // 可选语言列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;label&quot;: &quot;中文&quot;,&quot;value&quot;: &quot;zh&quot;},{&quot;label&quot;: &quot;英文&quot;,&quot;value&quot;: &quot;en&quot;}]</para>
        /// </summary>
        [NameInMap("language_list")]
        [Validation(Required=false)]
        public List<DictionaryInfoBO> LanguageList { get; set; }

        // 父模板智能体名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>小蚁模板</para>
        /// </summary>
        [NameInMap("parent_template_agent_name")]
        [Validation(Required=false)]
        public string ParentTemplateAgentName { get; set; }

    }

}
