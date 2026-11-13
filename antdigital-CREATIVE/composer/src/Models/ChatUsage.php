<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class ChatUsage extends Model {
    protected $_name = [
        'promptTokens' => 'prompt_tokens',
        'completionTokens' => 'completion_tokens',
        'totalTokens' => 'total_tokens',
        'originalPrice' => 'original_price',
        'currency' => 'currency',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->promptTokens) {
            $res['prompt_tokens'] = $this->promptTokens;
        }
        if (null !== $this->completionTokens) {
            $res['completion_tokens'] = $this->completionTokens;
        }
        if (null !== $this->totalTokens) {
            $res['total_tokens'] = $this->totalTokens;
        }
        if (null !== $this->originalPrice) {
            $res['original_price'] = $this->originalPrice;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChatUsage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['prompt_tokens'])){
            $model->promptTokens = $map['prompt_tokens'];
        }
        if(isset($map['completion_tokens'])){
            $model->completionTokens = $map['completion_tokens'];
        }
        if(isset($map['total_tokens'])){
            $model->totalTokens = $map['total_tokens'];
        }
        if(isset($map['original_price'])){
            $model->originalPrice = $map['original_price'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        return $model;
    }
    // 输入 token 数
    /**
     * @example 121212
     * @var string
     */
    public $promptTokens;

    // 输出 token 数
    /**
     * @example 1111
     * @var string
     */
    public $completionTokens;

    // 总 token 数
    /**
     * @example 121212
     * @var string
     */
    public $totalTokens;

    // 本次调用实际消耗金额
    /**
     * @example 11.01
     * @var string
     */
    public $originalPrice;

    // 币种
    /**
     * @example CNY
     * @var string
     */
    public $currency;

}
