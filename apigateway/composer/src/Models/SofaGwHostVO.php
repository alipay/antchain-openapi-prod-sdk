<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwHostVO extends Model
{
    // 服务器地址，域名或ip(:端口)
    /**
     * @example dsrconsole.alipay.com:8080
     *
     * @var string
     */
    public $address;

    // host name
    /**
     * @example dsrconsole_01
     *
     * @var string
     */
    public $hostName;

    // 元信息
    /**
     * @example dsrconsole.alipay.com
     *
     * @var string
     */
    public $metaData;
    protected $_name = [
        'address'  => 'address',
        'hostName' => 'host_name',
        'metaData' => 'meta_data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->hostName) {
            $res['host_name'] = $this->hostName;
        }
        if (null !== $this->metaData) {
            $res['meta_data'] = $this->metaData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SofaGwHostVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['host_name'])) {
            $model->hostName = $map['host_name'];
        }
        if (isset($map['meta_data'])) {
            $model->metaData = $map['meta_data'];
        }

        return $model;
    }
}
