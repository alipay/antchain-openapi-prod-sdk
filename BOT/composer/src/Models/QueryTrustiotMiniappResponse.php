<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\AccessScopeItem;

class QueryTrustiotMiniappResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'redirectUrl' => 'redirect_url',
        'validFrom' => 'valid_from',
        'validTo' => 'valid_to',
        'invalidTargets' => 'invalid_targets',
        'validTargetCount' => 'valid_target_count',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        if (null !== $this->validFrom) {
            $res['valid_from'] = $this->validFrom;
        }
        if (null !== $this->validTo) {
            $res['valid_to'] = $this->validTo;
        }
        if (null !== $this->invalidTargets) {
            $res['invalid_targets'] = [];
            if(null !== $this->invalidTargets && is_array($this->invalidTargets)){
                $n = 0;
                foreach($this->invalidTargets as $item){
                    $res['invalid_targets'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->validTargetCount) {
            $res['valid_target_count'] = $this->validTargetCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTrustiotMiniappResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['redirect_url'])){
            $model->redirectUrl = $map['redirect_url'];
        }
        if(isset($map['valid_from'])){
            $model->validFrom = $map['valid_from'];
        }
        if(isset($map['valid_to'])){
            $model->validTo = $map['valid_to'];
        }
        if(isset($map['invalid_targets'])){
            if(!empty($map['invalid_targets'])){
                $model->invalidTargets = [];
                $n = 0;
                foreach($map['invalid_targets'] as $item) {
                    $model->invalidTargets[$n++] = null !== $item ? AccessScopeItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['valid_target_count'])){
            $model->validTargetCount = $map['valid_target_count'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 一次性跳转链接：`{渠道登录页地址}?redirectToken=访问令牌`。链接整体 24 小时有效（见 valid_to），令牌一次性消费、用后即失效
    /**
     * @var string
     */
    public $redirectUrl;

    // 链接生效时间，秒级时间戳
    /**
     * @var int
     */
    public $validFrom;

    // 链接过期时间，秒级时间戳，valid_from 起 24 小时。过期后链接不可用
    /**
     * @var int
     */
    public $validTo;

    // 清单访问中未命中登记的访问目标回显，结构与 access_scope 条目相同（scene + 设备清单）。部分无效不影响签发，全部无效返回 422（NO_VALID_DEVICE）。主体访问（类型0）恒为空数组
    /**
     * @var AccessScopeItem[]
     */
    public $invalidTargets;

    // 链接实际生效的目标数：范围解析含直接子设备并集、按场景与目标去重后的总数。清单访问与主体访问均返回该口径
    /**
     * @var int
     */
    public $validTargetCount;

}
