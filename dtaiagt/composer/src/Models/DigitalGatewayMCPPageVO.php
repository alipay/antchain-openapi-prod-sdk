<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DigitalGatewayMCPPageVO extends Model
{
    // 空间id
    /**
     * @example 123
     *
     * @var string
     */
    public $spaceId;

    // server_id
    /**
     * @example server_id
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

    // server_name
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

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // mcp分类
    /**
     * @example
     *
     * @var string[]
     */
    public $categories;
    protected $_name = [
        'spaceId'     => 'space_id',
        'serverId'    => 'server_id',
        'serverCode'  => 'server_code',
        'serverName'  => 'server_name',
        'icon'        => 'icon',
        'description' => 'description',
        'categories'  => 'categories',
    ];

    public function validate()
    {
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('serverId', $this->serverId, true);
        Model::validateRequired('serverCode', $this->serverCode, true);
        Model::validateRequired('serverName', $this->serverName, true);
        Model::validateRequired('icon', $this->icon, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('categories', $this->categories, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->categories) {
            $res['categories'] = $this->categories;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DigitalGatewayMCPPageVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['categories'])) {
            if (!empty($map['categories'])) {
                $model->categories = $map['categories'];
            }
        }

        return $model;
    }
}
