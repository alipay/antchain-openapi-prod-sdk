<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class ApplyGuardTextbaseRequest extends Model
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

    // 待审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
    /**
     * @var string
     */
    public $content;

    // 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
    /**
     * @var string
     */
    public $sceneCode;

    // 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    /**
     * @var string
     */
    public $dataId1;

    //
    // 标识上游应用来源，字符串长度不能超过 128
    /**
     * @var string
     */
    public $appCode;

    // 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    /**
     * @var string
     */
    public $businessId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'content'           => 'content',
        'sceneCode'         => 'scene_code',
        'dataId1'           => 'data_id1',
        'appCode'           => 'app_code',
        'businessId'        => 'business_id',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('dataId1', $this->dataId1, true);
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
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->dataId1) {
            $res['data_id1'] = $this->dataId1;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyGuardTextbaseRequest
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
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['data_id1'])) {
            $model->dataId1 = $map['data_id1'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }

        return $model;
    }
}
