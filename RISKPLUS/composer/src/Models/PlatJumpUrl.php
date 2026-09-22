<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PlatJumpUrl extends Model {
    protected $_name = [
        'confirmUrl' => 'confirm_url',
        'cancelUrl' => 'cancel_url',
    ];
    public function validate() {
        Model::validateRequired('confirmUrl', $this->confirmUrl, true);
        Model::validateRequired('cancelUrl', $this->cancelUrl, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->confirmUrl) {
            $res['confirm_url'] = $this->confirmUrl;
        }
        if (null !== $this->cancelUrl) {
            $res['cancel_url'] = $this->cancelUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PlatJumpUrl
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['confirm_url'])){
            $model->confirmUrl = $map['confirm_url'];
        }
        if(isset($map['cancel_url'])){
            $model->cancelUrl = $map['cancel_url'];
        }
        return $model;
    }
    // 确认跳转URL，确认后回跳平台地址
    /**
     * @example http://platform.com/confirm/ca
     * @var string
     */
    public $confirmUrl;

    // 取消跳转URL，取消后回跳平台地址，失效也是这个链接
    /**
     * @example http://platform.com/confirm/ca
     * @var string
     */
    public $cancelUrl;

}
