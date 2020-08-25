<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class TsrResponse extends Model {
    protected $_name = [
        'code' => 'code',
        'ctsr' => 'ctsr',
        'hashedMessage' => 'hashed_message',
        'hashAlgorithm' => 'hash_algorithm',
        'message' => 'message',
        'sn' => 'sn',
        'ts' => 'ts',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->ctsr) {
            $res['ctsr'] = $this->ctsr;
        }
        if (null !== $this->hashedMessage) {
            $res['hashed_message'] = $this->hashedMessage;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->ts) {
            $res['ts'] = $this->ts;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TsrResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['ctsr'])){
            $model->ctsr = $map['ctsr'];
        }
        if(isset($map['hashed_message'])){
            $model->hashedMessage = $map['hashed_message'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['sn'])){
            $model->sn = $map['sn'];
        }
        if(isset($map['ts'])){
            $model->ts = $map['ts'];
        }
        return $model;
    }
    // 可信时间请求结果状态吗
    /**
     * @example 0
     * @var string
     */
    public $code;

    // 精简后的时间戳完整编码（在校验时需要提交）
    /**
     * @example  
     * @var string
     */
    public $ctsr;

    // hash后的信息
    /**
     * @example AAAAA 
     * @var string
     */
    public $hashedMessage;

    // 哈希算法
    /**
     * @example 321
     * @var string
     */
    public $hashAlgorithm;

    // 请求失败时候的错误信息
    /**
     * @example Request failed
     * @var string
     */
    public $message;

    // 凭证序列号 （在校验的时需要先填写凭证编号）
    // 
    /**
     * @example  
     * @var string
     */
    public $sn;

    // 时间
    /**
     * @example 123
     * @var string
     */
    public $ts;

}
