<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models;

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

    // bid
    /**
     * @example bid
     *
     * @var string
     */
    public $bid;

    // createtime
    /**
     * @example createtime
     *
     * @var int
     */
    public $createtime;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // updatetime
    /**
     * @example 1231231231231
     *
     * @var int
     */
    public $updatetime;

    // username
    /**
     * @example username
     *
     * @var string
     */
    public $username;
    protected $_name = [
        'antChainId' => 'ant_chain_id',
        'bid'        => 'bid',
        'createtime' => 'createtime',
        'status'     => 'status',
        'updatetime' => 'updatetime',
        'username'   => 'username',
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
        if (null !== $this->bid) {
            $res['bid'] = $this->bid;
        }
        if (null !== $this->createtime) {
            $res['createtime'] = $this->createtime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->updatetime) {
            $res['updatetime'] = $this->updatetime;
        }
        if (null !== $this->username) {
            $res['username'] = $this->username;
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
        if (isset($map['bid'])) {
            $model->bid = $map['bid'];
        }
        if (isset($map['createtime'])) {
            $model->createtime = $map['createtime'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['updatetime'])) {
            $model->updatetime = $map['updatetime'];
        }
        if (isset($map['username'])) {
            $model->username = $map['username'];
        }

        return $model;
    }
}
