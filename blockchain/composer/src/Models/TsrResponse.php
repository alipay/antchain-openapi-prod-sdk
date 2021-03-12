<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TsrResponse extends Model
{
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

    // 时间
    /**
     * @example 123
     *
     * @var string
     */
    public $ts;
    protected $_name = [
        'hashedMessage' => 'hashed_message',
        'hashAlgorithm' => 'hash_algorithm',
        'ts'            => 'ts',
    ];

    public function validate()
    {
        Model::validateRequired('hashedMessage', $this->hashedMessage, true);
        Model::validateRequired('hashAlgorithm', $this->hashAlgorithm, true);
        Model::validateRequired('ts', $this->ts, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hashedMessage) {
            $res['hashed_message'] = $this->hashedMessage;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->ts) {
            $res['ts'] = $this->ts;
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
        if (isset($map['hashed_message'])) {
            $model->hashedMessage = $map['hashed_message'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if (isset($map['ts'])) {
            $model->ts = $map['ts'];
        }

        return $model;
    }
}
