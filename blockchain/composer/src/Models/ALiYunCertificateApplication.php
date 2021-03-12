<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunCertificateApplication extends Model
{
    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // username
    /**
     * @example username
     *
     * @var string
     */
    public $username;

    // createtime
    /**
     * @example createtime
     *
     * @var int
     */
    public $createtime;

    // updatetime
    /**
     * @example 1231231231231
     *
     * @var int
     */
    public $updatetime;

    // bid
    /**
     * @example bid
     *
     * @var string
     */
    public $bid;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'antChainId' => 'ant_chain_id',
        'username'   => 'username',
        'createtime' => 'createtime',
        'updatetime' => 'updatetime',
        'bid'        => 'bid',
        'status'     => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->username) {
            $res['username'] = $this->username;
        }
        if (null !== $this->createtime) {
            $res['createtime'] = $this->createtime;
        }
        if (null !== $this->updatetime) {
            $res['updatetime'] = $this->updatetime;
        }
        if (null !== $this->bid) {
            $res['bid'] = $this->bid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunCertificateApplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['username'])) {
            $model->username = $map['username'];
        }
        if (isset($map['createtime'])) {
            $model->createtime = $map['createtime'];
        }
        if (isset($map['updatetime'])) {
            $model->updatetime = $map['updatetime'];
        }
        if (isset($map['bid'])) {
            $model->bid = $map['bid'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
