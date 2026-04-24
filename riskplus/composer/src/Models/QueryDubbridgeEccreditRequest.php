<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeEccreditRequest extends Model
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

    // 外部申请编号 third_apply_no、apply_no必填其一)
    /**
     * @var string
     */
    public $thirdApplyNo;

    // 银行审批流水号 third_apply_no、apply_no必填其一)
    /**
     * @var string
     */
    public $applyNo;

    // 企业名称 客户企业的工商注册名称，有企业信息则必输
    /**
     * @var string
     */
    public $entName;

    // 企业证件号码 客户企业的统一社会信用代码，有企业信息则必输
    /**
     * @var string
     */
    public $entIdNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessScene'     => 'business_scene',
        'thirdApplyNo'      => 'third_apply_no',
        'applyNo'           => 'apply_no',
        'entName'           => 'ent_name',
        'entIdNo'           => 'ent_id_no',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('entName', $this->entName, true);
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
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->entName) {
            $res['ent_name'] = $this->entName;
        }
        if (null !== $this->entIdNo) {
            $res['ent_id_no'] = $this->entIdNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeEccreditRequest
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
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }
        if (isset($map['ent_name'])) {
            $model->entName = $map['ent_name'];
        }
        if (isset($map['ent_id_no'])) {
            $model->entIdNo = $map['ent_id_no'];
        }

        return $model;
    }
}
