<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ReleaseBlockchainOrderLogicalRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // bid
    /**
     * @var string
     */
    public $bid;

    // country
    /**
     * @var string
     */
    public $country;

    // gmt_wakeup
    /**
     * @var string
     */
    public $gmtWakeup;

    // hid
    /**
     * @var int
     */
    public $hid;

    // 中断标识
    /**
     * @var bool
     */
    public $interrupt;

    // pk
    /**
     * @var string
     */
    public $pk;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // request_id
    /**
     * @var string
     */
    public $requestId;

    // task_extra_data
    /**
     * @var string
     */
    public $taskExtraData;

    // task_identifier
    /**
     * @var string
     */
    public $taskIdentifier;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bid'               => 'bid',
        'country'           => 'country',
        'gmtWakeup'         => 'gmt_wakeup',
        'hid'               => 'hid',
        'interrupt'         => 'interrupt',
        'pk'                => 'pk',
        'regionId'          => 'region_id',
        'requestId'         => 'request_id',
        'taskExtraData'     => 'task_extra_data',
        'taskIdentifier'    => 'task_identifier',
    ];

    public function validate()
    {
        Model::validateRequired('bid', $this->bid, true);
        Model::validateRequired('hid', $this->hid, true);
        Model::validateRequired('pk', $this->pk, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bid) {
            $res['bid'] = $this->bid;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->gmtWakeup) {
            $res['gmt_wakeup'] = $this->gmtWakeup;
        }
        if (null !== $this->hid) {
            $res['hid'] = $this->hid;
        }
        if (null !== $this->interrupt) {
            $res['interrupt'] = $this->interrupt;
        }
        if (null !== $this->pk) {
            $res['pk'] = $this->pk;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->taskExtraData) {
            $res['task_extra_data'] = $this->taskExtraData;
        }
        if (null !== $this->taskIdentifier) {
            $res['task_identifier'] = $this->taskIdentifier;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseBlockchainOrderLogicalRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['bid'])) {
            $model->bid = $map['bid'];
        }
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['gmt_wakeup'])) {
            $model->gmtWakeup = $map['gmt_wakeup'];
        }
        if (isset($map['hid'])) {
            $model->hid = $map['hid'];
        }
        if (isset($map['interrupt'])) {
            $model->interrupt = $map['interrupt'];
        }
        if (isset($map['pk'])) {
            $model->pk = $map['pk'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['task_extra_data'])) {
            $model->taskExtraData = $map['task_extra_data'];
        }
        if (isset($map['task_identifier'])) {
            $model->taskIdentifier = $map['task_identifier'];
        }

        return $model;
    }
}
