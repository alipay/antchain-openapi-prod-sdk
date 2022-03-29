<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AgentVersionStrategy extends Model
{
    // agent 地址
    /**
     * @example acs-reg.alipay.com/pontusagent
     *
     * @var string
     */
    public $url;

    // agent 版本号
    /**
     * @example 1.2.0
     *
     * @var string
     */
    public $version;

    // 0 容器，1经典
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // 0 生效，1失效
    /**
     * @example 0
     *
     * @var int
     */
    public $status;

    // agent 版本内容
    /**
     * @example “”
     *
     * @var string
     */
    public $content;

    // 生效范围
    /**
     * @example WORKSPACE
     *
     * @var string
     */
    public $scope;

    // 生效范围的唯一标识
    /**
     * @example 123
     *
     * @var string
     */
    public $scopeIdentity;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;
    protected $_name = [
        'url'           => 'url',
        'version'       => 'version',
        'type'          => 'type',
        'status'        => 'status',
        'content'       => 'content',
        'scope'         => 'scope',
        'scopeIdentity' => 'scope_identity',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('scopeIdentity', $this->scopeIdentity, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentVersionStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_identity'])) {
            $model->scopeIdentity = $map['scope_identity'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
