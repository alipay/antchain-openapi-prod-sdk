<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class StartRcpHqRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 房产查询场景,NO_AUTH_QUERY=无授权直查
    /**
     * @var string
     */
    public $scene;

    // 助贷平台
    /**
     * @var string
     */
    public $loanAssistPlatform;

    // 房产链内部银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 外部业务单号
    /**
     * @var string
     */
    public $outBizNo;

    // 房产信息
    /**
     * @var House
     */
    public $house;

    // 查询产权
    /**
     * @var HouseOwner
     */
    public $houseOwner;

    // 办理业务分支行
    /**
     * @var Bank
     */
    public $branchBank;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'scene'              => 'scene',
        'loanAssistPlatform' => 'loan_assist_platform',
        'bankNo'             => 'bank_no',
        'outBizNo'           => 'out_biz_no',
        'house'              => 'house',
        'houseOwner'         => 'house_owner',
        'branchBank'         => 'branch_bank',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('loanAssistPlatform', $this->loanAssistPlatform, true);
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('house', $this->house, true);
        Model::validateRequired('houseOwner', $this->houseOwner, true);
        Model::validateRequired('branchBank', $this->branchBank, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->loanAssistPlatform) {
            $res['loan_assist_platform'] = $this->loanAssistPlatform;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->house) {
            $res['house'] = null !== $this->house ? $this->house->toMap() : null;
        }
        if (null !== $this->houseOwner) {
            $res['house_owner'] = null !== $this->houseOwner ? $this->houseOwner->toMap() : null;
        }
        if (null !== $this->branchBank) {
            $res['branch_bank'] = null !== $this->branchBank ? $this->branchBank->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartRcpHqRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['loan_assist_platform'])) {
            $model->loanAssistPlatform = $map['loan_assist_platform'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['house'])) {
            $model->house = House::fromMap($map['house']);
        }
        if (isset($map['house_owner'])) {
            $model->houseOwner = HouseOwner::fromMap($map['house_owner']);
        }
        if (isset($map['branch_bank'])) {
            $model->branchBank = Bank::fromMap($map['branch_bank']);
        }

        return $model;
    }
}
