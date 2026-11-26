<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class McpInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'transport' => 'transport',
        'endpoint' => 'endpoint',
        'headers' => 'headers',
        'mcpId' => 'mcp_id',
        'tools' => 'tools',
        'approvalRequired' => 'approval_required',
        'approvalExemptTools' => 'approval_exempt_tools',
        'approvalEnabled' => 'approval_enabled',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('transport', $this->transport, true);
        Model::validateRequired('mcpId', $this->mcpId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->transport) {
            $res['transport'] = $this->transport;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->headers) {
            $res['headers'] = $this->headers;
        }
        if (null !== $this->mcpId) {
            $res['mcp_id'] = $this->mcpId;
        }
        if (null !== $this->tools) {
            $res['tools'] = $this->tools;
        }
        if (null !== $this->approvalRequired) {
            $res['approval_required'] = $this->approvalRequired;
        }
        if (null !== $this->approvalExemptTools) {
            $res['approval_exempt_tools'] = $this->approvalExemptTools;
        }
        if (null !== $this->approvalEnabled) {
            $res['approval_enabled'] = $this->approvalEnabled;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return McpInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['transport'])){
            $model->transport = $map['transport'];
        }
        if(isset($map['endpoint'])){
            $model->endpoint = $map['endpoint'];
        }
        if(isset($map['headers'])){
            $model->headers = $map['headers'];
        }
        if(isset($map['mcp_id'])){
            $model->mcpId = $map['mcp_id'];
        }
        if(isset($map['tools'])){
            if(!empty($map['tools'])){
                $model->tools = $map['tools'];
            }
        }
        if(isset($map['approval_required'])){
            $model->approvalRequired = $map['approval_required'];
        }
        if(isset($map['approval_exempt_tools'])){
            if(!empty($map['approval_exempt_tools'])){
                $model->approvalExemptTools = $map['approval_exempt_tools'];
            }
        }
        if(isset($map['approval_enabled'])){
            $model->approvalEnabled = $map['approval_enabled'];
        }
        return $model;
    }
    // mcp名字
    /**
     * @example undefined
     * @var string
     */
    public $name;

    // 协议类型：STREAM_HTTP / SSE / STDIO（大小写不敏感）
    /**
     * @example STREAM_HTTP
     * @var string
     */
    public $transport;

    // 协议地址
    /**
     * @example undefined
     * @var string
     */
    public $endpoint;

    // 请求头键值对 JSON 字符串，可含鉴权密钥
    /**
     * @example undefined
     * @var string
     */
    public $headers;

    // mcp 幂等标识（agent.detail 回传值，编辑复用）
    /**
     * @example undefined
     * @var string
     */
    public $mcpId;

    // 工具名白名单：只列出的工具暴露给 LLM，至少 1 个
    /**
     * @example undefined
     * @var string[]
     */
    public $tools;

    // 该 MCP 的工具默认是否需要用户审批确认（R2 授权流）；缺省按服务端安全缺省 true
    /**
     * @example undefined
     * @var bool
     */
    public $approvalRequired;

    // 免审批工具名名单：无需用户确认直接执行；缺省空（全部按 approval_required 判定）
    /**
     * @example undefined
     * @var string[]
     */
    public $approvalExemptTools;

    // 审批交互开关：true 时需审批工具经 INTERACTION_REQUIRED→DECIDE 用户确认；false 时需审批工具不派发（fail-closed）
    /**
     * @example undefined
     * @var bool
     */
    public $approvalEnabled;

}
