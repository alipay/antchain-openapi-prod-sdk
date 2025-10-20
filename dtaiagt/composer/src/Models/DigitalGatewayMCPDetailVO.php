<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DigitalGatewayMCPDetailVO extends Model
{
    // server_host
    /**
     * @example server_host
     *
     * @var string
     */
    public $serverHost;

    // server请求协议
    /**
     * @example transport_protocol
     *
     * @var string
     */
    public $transportProtocol;

    // 网关请求令牌
    /**
     * @example server_token
     *
     * @var string
     */
    public $serverToken;

    // 空间id
    /**
     * @example 123
     *
     * @var string
     */
    public $spaceId;

    // server_id
    /**
     * @example 123
     *
     * @var string
     */
    public $serverId;

    // server_code
    /**
     * @example server_code
     *
     * @var string
     */
    public $serverCode;

    // server名称
    /**
     * @example server_name
     *
     * @var string
     */
    public $serverName;

    // icon
    /**
     * @example icon
     *
     * @var string
     */
    public $icon;

    // server描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // mcp上架信息（富文本）
    /**
     * @example docs
     *
     * @var string
     */
    public $docs;

    // 工具列表
    /**
     * @example
     *
     * @var ToolInfoVO
     */
    public $toolList;
    protected $_name = [
        'serverHost'        => 'server_host',
        'transportProtocol' => 'transport_protocol',
        'serverToken'       => 'server_token',
        'spaceId'           => 'space_id',
        'serverId'          => 'server_id',
        'serverCode'        => 'server_code',
        'serverName'        => 'server_name',
        'icon'              => 'icon',
        'description'       => 'description',
        'docs'              => 'docs',
        'toolList'          => 'tool_list',
    ];

    public function validate()
    {
        Model::validateRequired('serverHost', $this->serverHost, true);
        Model::validateRequired('transportProtocol', $this->transportProtocol, true);
        Model::validateRequired('serverToken', $this->serverToken, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('serverId', $this->serverId, true);
        Model::validateRequired('serverCode', $this->serverCode, true);
        Model::validateRequired('serverName', $this->serverName, true);
        Model::validateRequired('icon', $this->icon, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('docs', $this->docs, true);
        Model::validateRequired('toolList', $this->toolList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serverHost) {
            $res['server_host'] = $this->serverHost;
        }
        if (null !== $this->transportProtocol) {
            $res['transport_protocol'] = $this->transportProtocol;
        }
        if (null !== $this->serverToken) {
            $res['server_token'] = $this->serverToken;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->serverId) {
            $res['server_id'] = $this->serverId;
        }
        if (null !== $this->serverCode) {
            $res['server_code'] = $this->serverCode;
        }
        if (null !== $this->serverName) {
            $res['server_name'] = $this->serverName;
        }
        if (null !== $this->icon) {
            $res['icon'] = $this->icon;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->docs) {
            $res['docs'] = $this->docs;
        }
        if (null !== $this->toolList) {
            $res['tool_list'] = null !== $this->toolList ? $this->toolList->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DigitalGatewayMCPDetailVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['server_host'])) {
            $model->serverHost = $map['server_host'];
        }
        if (isset($map['transport_protocol'])) {
            $model->transportProtocol = $map['transport_protocol'];
        }
        if (isset($map['server_token'])) {
            $model->serverToken = $map['server_token'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['server_id'])) {
            $model->serverId = $map['server_id'];
        }
        if (isset($map['server_code'])) {
            $model->serverCode = $map['server_code'];
        }
        if (isset($map['server_name'])) {
            $model->serverName = $map['server_name'];
        }
        if (isset($map['icon'])) {
            $model->icon = $map['icon'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['docs'])) {
            $model->docs = $map['docs'];
        }
        if (isset($map['tool_list'])) {
            $model->toolList = ToolInfoVO::fromMap($map['tool_list']);
        }

        return $model;
    }
}
