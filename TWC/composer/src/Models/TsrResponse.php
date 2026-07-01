<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class TsrResponse extends Model
{
    // 可信时间请求结果状态吗
    /**
     * @example 0
     *
     * @var string
     */
    public $code;

    // hash后的信息
    /**
     * @example AAAAA
     *
     * @var string
     */
    public $hashedMessage;

    // 哈希算法
    /**
     * @example 321
     *
     * @var string
     */
    public $hashAlgorithm;

    // 请求失败时候的错误信息
    /**
     * @example Request failed
     *
     * @var string
     */
    public $message;

    // 时间
    /**
     * @example 123
     *
     * @var string
     */
    public $ts;

    // 精简后的时间戳完整编码（在校验时需要提交）
    /**
     * @example
     *
     * @var string
     */
    public $ctsr;

    // 凭证序列号 （在校验的时需要先填写凭证编号）
    //
    /**
     * @example
     *
     * @var string
     */
    public $sn;
    protected $_name = [
        'code'          => 'code',
        'hashedMessage' => 'hashed_message',
        'hashAlgorithm' => 'hash_algorithm',
        'message'       => 'message',
        'ts'            => 'ts',
        'ctsr'          => 'ctsr',
        'sn'            => 'sn',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('hashedMessage', $this->hashedMessage, true);
        Model::validateRequired('hashAlgorithm', $this->hashAlgorithm, true);
        Model::validateRequired('ts', $this->ts, true);
        Model::validateRequired('ctsr', $this->ctsr, true);
        Model::validateRequired('sn', $this->sn, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
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
        if (null !== $this->ts) {
            $res['ts'] = $this->ts;
        }
        if (null !== $this->ctsr) {
            $res['ctsr'] = $this->ctsr;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TsrResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['hashed_message'])) {
            $model->hashedMessage = $map['hashed_message'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['ts'])) {
            $model->ts = $map['ts'];
        }
        if (isset($map['ctsr'])) {
            $model->ctsr = $map['ctsr'];
        }
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }

        return $model;
    }
}
