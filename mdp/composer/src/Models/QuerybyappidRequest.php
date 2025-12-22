<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MDP\Models;

use AlibabaCloud\Tea\Model;

class QuerybyappidRequest extends Model
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

    // appid
    /**
     * @var string
     */
    public $appid;

    // 手机或者设备md5
    /**
     * @var string
     */
    public $userid;

    // mobile/device
    /**
     * @var string
     */
    public $idtype;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appid'             => 'appid',
        'userid'            => 'userid',
        'idtype'            => 'idtype',
    ];

    public function validate()
    {
        Model::validateRequired('appid', $this->appid, true);
        Model::validateRequired('userid', $this->userid, true);
        Model::validateRequired('idtype', $this->idtype, true);
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
        if (null !== $this->appid) {
            $res['appid'] = $this->appid;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }
        if (null !== $this->idtype) {
            $res['idtype'] = $this->idtype;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerybyappidRequest
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
        if (isset($map['appid'])) {
            $model->appid = $map['appid'];
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }
        if (isset($map['idtype'])) {
            $model->idtype = $map['idtype'];
        }

        return $model;
    }
}
