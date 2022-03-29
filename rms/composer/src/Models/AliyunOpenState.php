<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AliyunOpenState extends Model
{
    // 阿里云用户ID
    /**
     * @example 123
     *
     * @var int
     */
    public $aliyunUserId;

    // 阿里云实例ID
    /**
     * @example 123
     *
     * @var string
     */
    public $aliyunInstanceId;

    // 监控租户ID
    /**
     * @example 2
     *
     * @var int
     */
    public $tenantId;

    // 监控租户名称
    /**
     * @example ABCDEF
     *
     * @var string
     */
    public $tenantName;

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

    // 开通状态，0未开通，1开通
    /**
     * @example 1
     *
     * @var int
     */
    public $state;
    protected $_name = [
        'aliyunUserId'     => 'aliyun_user_id',
        'aliyunInstanceId' => 'aliyun_instance_id',
        'tenantId'         => 'tenant_id',
        'tenantName'       => 'tenant_name',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'state'            => 'state',
    ];

    public function validate()
    {
        Model::validateRequired('aliyunUserId', $this->aliyunUserId, true);
        Model::validateRequired('aliyunInstanceId', $this->aliyunInstanceId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->aliyunUserId) {
            $res['aliyun_user_id'] = $this->aliyunUserId;
        }
        if (null !== $this->aliyunInstanceId) {
            $res['aliyun_instance_id'] = $this->aliyunInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AliyunOpenState
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['aliyun_user_id'])) {
            $model->aliyunUserId = $map['aliyun_user_id'];
        }
        if (isset($map['aliyun_instance_id'])) {
            $model->aliyunInstanceId = $map['aliyun_instance_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }

        return $model;
    }
}
