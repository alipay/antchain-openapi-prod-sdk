<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceargsRequest extends Model
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

    // 设备SN
    /**
     * @var string
     */
    public $serialNo;

    // 设备厂商
    /**
     * @var string
     */
    public $corpName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serialNo'          => 'serial_no',
        'corpName'          => 'corp_name',
    ];

    public function validate()
    {
        Model::validateRequired('serialNo', $this->serialNo, true);
        Model::validateRequired('corpName', $this->corpName, true);
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
        if (null !== $this->serialNo) {
            $res['serial_no'] = $this->serialNo;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceargsRequest
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
        if (isset($map['serial_no'])) {
            $model->serialNo = $map['serial_no'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }

        return $model;
    }
}
