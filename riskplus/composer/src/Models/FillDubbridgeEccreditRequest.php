<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class FillDubbridgeEccreditRequest extends Model
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

    // 业务场景码
    /**
     * @var string
     */
    public $businessScene;

    // 外部申请编号 合作方调用时，生成唯一流水号
    /**
     * @var string
     */
    public $thirdApplyNo;

    // biz_content
    /**
     * @var EcBizContend
     */
    public $bizContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessScene'     => 'business_scene',
        'thirdApplyNo'      => 'third_apply_no',
        'bizContent'        => 'biz_content',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('thirdApplyNo', $this->thirdApplyNo, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
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
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->thirdApplyNo) {
            $res['third_apply_no'] = $this->thirdApplyNo;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = null !== $this->bizContent ? $this->bizContent->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FillDubbridgeEccreditRequest
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
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['third_apply_no'])) {
            $model->thirdApplyNo = $map['third_apply_no'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = EcBizContend::fromMap($map['biz_content']);
        }

        return $model;
    }
}
