<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class DisableDynamicslbRequest extends Model
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

    // envid
    /**
     * @var string
     */
    public $envid;

    // 部署单元id
    /**
     * @var string
     */
    public $unitinstanceid;

    // prodcode
    /**
     * @var string
     */
    public $prodcode;

    // appname
    /**
     * @var string
     */
    public $appname;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envid'             => 'envid',
        'unitinstanceid'    => 'unitinstanceid',
        'prodcode'          => 'prodcode',
        'appname'           => 'appname',
    ];

    public function validate()
    {
        Model::validateRequired('envid', $this->envid, true);
        Model::validateRequired('unitinstanceid', $this->unitinstanceid, true);
        Model::validateRequired('prodcode', $this->prodcode, true);
        Model::validateRequired('appname', $this->appname, true);
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
        if (null !== $this->envid) {
            $res['envid'] = $this->envid;
        }
        if (null !== $this->unitinstanceid) {
            $res['unitinstanceid'] = $this->unitinstanceid;
        }
        if (null !== $this->prodcode) {
            $res['prodcode'] = $this->prodcode;
        }
        if (null !== $this->appname) {
            $res['appname'] = $this->appname;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisableDynamicslbRequest
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
        if (isset($map['envid'])) {
            $model->envid = $map['envid'];
        }
        if (isset($map['unitinstanceid'])) {
            $model->unitinstanceid = $map['unitinstanceid'];
        }
        if (isset($map['prodcode'])) {
            $model->prodcode = $map['prodcode'];
        }
        if (isset($map['appname'])) {
            $model->appname = $map['appname'];
        }

        return $model;
    }
}
