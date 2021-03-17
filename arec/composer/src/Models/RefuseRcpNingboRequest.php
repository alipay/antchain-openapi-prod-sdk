<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class RefuseRcpNingboRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 请求时间，是以long类型的字符串
    /**
     * @var string
     */
    public $timestamp;

    // 业务号
    /**
     * @var string
     */
    public $ywh;

    // 状态：1—审核通过（开始受理），2—驳回
    //
    /**
     * @var string
     */
    public $zt;

    // 备注，驳回原因
    /**
     * @var string
     */
    public $bz;

    // 操作人
    /**
     * @var string
     */
    public $czr;

    // 操作时间 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $czsj;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timestamp'         => 'timestamp',
        'ywh'               => 'ywh',
        'zt'                => 'zt',
        'bz'                => 'bz',
        'czr'               => 'czr',
        'czsj'              => 'czsj',
    ];

    public function validate()
    {
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('ywh', $this->ywh, true);
        Model::validateRequired('zt', $this->zt, true);
        Model::validateRequired('bz', $this->bz, true);
        Model::validateRequired('czr', $this->czr, true);
        Model::validateRequired('czsj', $this->czsj, true);
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
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->ywh) {
            $res['ywh'] = $this->ywh;
        }
        if (null !== $this->zt) {
            $res['zt'] = $this->zt;
        }
        if (null !== $this->bz) {
            $res['bz'] = $this->bz;
        }
        if (null !== $this->czr) {
            $res['czr'] = $this->czr;
        }
        if (null !== $this->czsj) {
            $res['czsj'] = $this->czsj;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefuseRcpNingboRequest
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
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['ywh'])) {
            $model->ywh = $map['ywh'];
        }
        if (isset($map['zt'])) {
            $model->zt = $map['zt'];
        }
        if (isset($map['bz'])) {
            $model->bz = $map['bz'];
        }
        if (isset($map['czr'])) {
            $model->czr = $map['czr'];
        }
        if (isset($map['czsj'])) {
            $model->czsj = $map['czsj'];
        }

        return $model;
    }
}
