<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SubmitAuthCrowdUploadRequest extends Model
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

    // 上传文件地址
    /**
     * @var string
     */
    public $uploadUrl;

    // 人群类型 （1，三个月的问卷人群，2，六个月的问卷人群，3，三个月的招募人群，4，六个月的招募人群）
    /**
     * @var string
     */
    public $crowdType;

    // 备注信息
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'uploadUrl'         => 'upload_url',
        'crowdType'         => 'crowd_type',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('uploadUrl', $this->uploadUrl, true);
        Model::validateRequired('crowdType', $this->crowdType, true);
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
        if (null !== $this->uploadUrl) {
            $res['upload_url'] = $this->uploadUrl;
        }
        if (null !== $this->crowdType) {
            $res['crowd_type'] = $this->crowdType;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAuthCrowdUploadRequest
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
        if (isset($map['upload_url'])) {
            $model->uploadUrl = $map['upload_url'];
        }
        if (isset($map['crowd_type'])) {
            $model->crowdType = $map['crowd_type'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
