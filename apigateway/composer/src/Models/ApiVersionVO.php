<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiVersionVO extends Model
{
    // API标识
    /**
     * @example api_id1
     *
     * @var string
     */
    public $apiId;

    // editOperator
    /**
     * @example scott
     *
     * @var string
     */
    public $editOperator;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 编辑时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtEdit;

    // 更改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // gmtOffline
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtOffline;

    // gmtOnline
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtOnline;

    // offlineDesc
    /**
     * @example offline_desc1
     *
     * @var string
     */
    public $offlineDesc;

    // offlineOperator
    /**
     * @example scott
     *
     * @var string
     */
    public $offlineOperator;

    // onlineDesc
    /**
     * @example online_desc1
     *
     * @var string
     */
    public $onlineDesc;

    // onlineOperator
    /**
     * @example online_operator1
     *
     * @var string
     */
    public $onlineOperator;

    // versionId
    /**
     * @example 4438Y8yXxU0cYrgS
     *
     * @var string
     */
    public $versionId;

    // 版本号
    /**
     * @example 1.2
     *
     * @var string
     */
    public $versionNo;

    // versionStatus
    /**
     * @example EDIT / ONLINE / OFFLINE
     *
     * @var string
     */
    public $versionStatus;

    // 能否发布
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canOnline;
    protected $_name = [
        'apiId'           => 'api_id',
        'editOperator'    => 'edit_operator',
        'gmtCreate'       => 'gmt_create',
        'gmtEdit'         => 'gmt_edit',
        'gmtModified'     => 'gmt_modified',
        'gmtOffline'      => 'gmt_offline',
        'gmtOnline'       => 'gmt_online',
        'offlineDesc'     => 'offline_desc',
        'offlineOperator' => 'offline_operator',
        'onlineDesc'      => 'online_desc',
        'onlineOperator'  => 'online_operator',
        'versionId'       => 'version_id',
        'versionNo'       => 'version_no',
        'versionStatus'   => 'version_status',
        'canOnline'       => 'can_online',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtEdit', $this->gmtEdit, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtOffline', $this->gmtOffline, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtOnline', $this->gmtOnline, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->editOperator) {
            $res['edit_operator'] = $this->editOperator;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtEdit) {
            $res['gmt_edit'] = $this->gmtEdit;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->gmtOffline) {
            $res['gmt_offline'] = $this->gmtOffline;
        }
        if (null !== $this->gmtOnline) {
            $res['gmt_online'] = $this->gmtOnline;
        }
        if (null !== $this->offlineDesc) {
            $res['offline_desc'] = $this->offlineDesc;
        }
        if (null !== $this->offlineOperator) {
            $res['offline_operator'] = $this->offlineOperator;
        }
        if (null !== $this->onlineDesc) {
            $res['online_desc'] = $this->onlineDesc;
        }
        if (null !== $this->onlineOperator) {
            $res['online_operator'] = $this->onlineOperator;
        }
        if (null !== $this->versionId) {
            $res['version_id'] = $this->versionId;
        }
        if (null !== $this->versionNo) {
            $res['version_no'] = $this->versionNo;
        }
        if (null !== $this->versionStatus) {
            $res['version_status'] = $this->versionStatus;
        }
        if (null !== $this->canOnline) {
            $res['can_online'] = $this->canOnline;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiVersionVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['edit_operator'])) {
            $model->editOperator = $map['edit_operator'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_edit'])) {
            $model->gmtEdit = $map['gmt_edit'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['gmt_offline'])) {
            $model->gmtOffline = $map['gmt_offline'];
        }
        if (isset($map['gmt_online'])) {
            $model->gmtOnline = $map['gmt_online'];
        }
        if (isset($map['offline_desc'])) {
            $model->offlineDesc = $map['offline_desc'];
        }
        if (isset($map['offline_operator'])) {
            $model->offlineOperator = $map['offline_operator'];
        }
        if (isset($map['online_desc'])) {
            $model->onlineDesc = $map['online_desc'];
        }
        if (isset($map['online_operator'])) {
            $model->onlineOperator = $map['online_operator'];
        }
        if (isset($map['version_id'])) {
            $model->versionId = $map['version_id'];
        }
        if (isset($map['version_no'])) {
            $model->versionNo = $map['version_no'];
        }
        if (isset($map['version_status'])) {
            $model->versionStatus = $map['version_status'];
        }
        if (isset($map['can_online'])) {
            $model->canOnline = $map['can_online'];
        }

        return $model;
    }
}
