<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAmlCorporationJoincommitRequest extends Model
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

    // 入驻准备阶段得到的数字标识
    /**
     * @var string
     */
    public $did;

    // 选择采用的TAPP ID编号，如果不填，系统将选择默认的kyc tapp进行执行
    /**
     * @var string
     */
    public $tappId;

    // 对应tapp的版本号。默认选择最新版本
    /**
     * @var int
     */
    public $tappVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'tappId'            => 'tapp_id',
        'tappVersion'       => 'tapp_version',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->tappId) {
            $res['tapp_id'] = $this->tappId;
        }
        if (null !== $this->tappVersion) {
            $res['tapp_version'] = $this->tappVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAmlCorporationJoincommitRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['tapp_id'])) {
            $model->tappId = $map['tapp_id'];
        }
        if (isset($map['tapp_version'])) {
            $model->tappVersion = $map['tapp_version'];
        }

        return $model;
    }
}
