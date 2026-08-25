<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class McpInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'transport' => 'transport',
        'endpoint' => 'endpoint',
        'headers' => 'headers',
        'mcpId' => 'mcp_id',
        'tools' => 'tools',
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
        return $model;
    }
    // mcp名字
    /**
     * @example mcp名字
     * @var string
     */
    public $name;

    // 协议类型
    /**
     * @example streamable_http / sse /stadio
     * @var string
     */
    public $transport;

    // 协议地址
    /**
     * @example 协议地址
     * @var string
     */
    public $endpoint;

    // json
    /**
     * @example {}
     * @var string
     */
    public $headers;

    // mcp_id
    /**
     * @example mcp_id
     * @var string
     */
    public $mcpId;

    // 工具名字
    /**
     * @example undefined
     * @var string[]
     */
    public $tools;

}
