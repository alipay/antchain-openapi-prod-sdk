<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainRest extends Model
{
    // access_id
    /**
     * @example access_id
     *
     * @var string
     */
    public $accessId;

    // create_time
    /**
     * @example 123123123
     *
     * @var int
     */
    public $createTime;

    // rest
    /**
     * @example rest
     *
     * @var string
     */
    public $rest;

    // update_time
    /**
     * @example 123123123
     *
     * @var int
     */
    public $updateTime;

    // REST开通结果
    /**
     * @example OK
     *
     * @var string
     */
    public $result;
    protected $_name = [
        'accessId'   => 'access_id',
        'createTime' => 'create_time',
        'rest'       => 'rest',
        'updateTime' => 'update_time',
        'result'     => 'result',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessId) {
            $res['access_id'] = $this->accessId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->rest) {
            $res['rest'] = $this->rest;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainRest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_id'])) {
            $model->accessId = $map['access_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['rest'])) {
            $model->rest = $map['rest'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }

        return $model;
    }
}
