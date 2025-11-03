<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitMeiyouAuditRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据Id
    /**
     * @var string
     */
    public $dataId;

    // 模态
    /**
     * @var string
     */
    public $modal;

    // 场景
    /**
     * @var string
     */
    public $sceneCode;

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;

    // 美柚审核记录信息
    /**
     * @var string
     */
    public $auditInfo;

    // 回调函数
    /**
     * @var string
     */
    public $callback;

    // 租户
    /**
     * @var string
     */
    public $tenantCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataId'            => 'data_id',
        'modal'             => 'modal',
        'sceneCode'         => 'scene_code',
        'extInfo'           => 'ext_info',
        'auditInfo'         => 'audit_info',
        'callback'          => 'callback',
        'tenantCode'        => 'tenant_code',
    ];

    public function validate()
    {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('modal', $this->modal, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('auditInfo', $this->auditInfo, true);
        Model::validateRequired('callback', $this->callback, true);
        Model::validateRequired('tenantCode', $this->tenantCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->modal) {
            $res['modal'] = $this->modal;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->auditInfo) {
            $res['audit_info'] = $this->auditInfo;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitMeiyouAuditRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['modal'])) {
            $model->modal = $map['modal'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['audit_info'])) {
            $model->auditInfo = $map['audit_info'];
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }

        return $model;
    }
}
