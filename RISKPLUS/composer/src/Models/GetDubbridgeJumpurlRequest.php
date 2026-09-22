<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\LoanConfirmInfo;
use AntChain\RISKPLUS\Models\PlatJumpUrl;

class GetDubbridgeJumpurlRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo' => 'order_no',
        'creditNo' => 'credit_no',
        'loanNo' => 'loan_no',
        'jumpNo' => 'jump_no',
        'loanConfirmInfo' => 'loan_confirm_info',
        'platJumpUrl' => 'plat_jump_url',
        'channelId' => 'channel_id',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('jumpNo', $this->jumpNo, true);
        Model::validateRequired('loanConfirmInfo', $this->loanConfirmInfo, true);
        Model::validateRequired('platJumpUrl', $this->platJumpUrl, true);
        Model::validateRequired('channelId', $this->channelId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->creditNo) {
            $res['credit_no'] = $this->creditNo;
        }
        if (null !== $this->loanNo) {
            $res['loan_no'] = $this->loanNo;
        }
        if (null !== $this->jumpNo) {
            $res['jump_no'] = $this->jumpNo;
        }
        if (null !== $this->loanConfirmInfo) {
            $res['loan_confirm_info'] = null !== $this->loanConfirmInfo ? $this->loanConfirmInfo->toMap() : null;
        }
        if (null !== $this->platJumpUrl) {
            $res['plat_jump_url'] = null !== $this->platJumpUrl ? $this->platJumpUrl->toMap() : null;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetDubbridgeJumpurlRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['credit_no'])){
            $model->creditNo = $map['credit_no'];
        }
        if(isset($map['loan_no'])){
            $model->loanNo = $map['loan_no'];
        }
        if(isset($map['jump_no'])){
            $model->jumpNo = $map['jump_no'];
        }
        if(isset($map['loan_confirm_info'])){
            $model->loanConfirmInfo = LoanConfirmInfo::fromMap($map['loan_confirm_info']);
        }
        if(isset($map['plat_jump_url'])){
            $model->platJumpUrl = PlatJumpUrl::fromMap($map['plat_jump_url']);
        }
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 请求唯一id
    /**
     * @var string
     */
    public $orderNo;

    // 授信流水号
    /**
     * @var string
     */
    public $creditNo;

    // 支用流水号
    /**
     * @var string
     */
    public $loanNo;

    // 跳端申请流水号
    /**
     * @var string
     */
    public $jumpNo;

    // 借款确认信息
    /**
     * @var LoanConfirmInfo
     */
    public $loanConfirmInfo;

    // 回跳平台方地址
    /**
     * @var PlatJumpUrl
     */
    public $platJumpUrl;

    // 合作方渠道标示，用于区分产品
    /**
     * @var string
     */
    public $channelId;

    // 拓展信息，json格式字符串
    /**
     * @var string
     */
    public $extInfo;

}
