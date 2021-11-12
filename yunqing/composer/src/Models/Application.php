<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Application extends Model
{
    // 应用英文名
    /**
     * @example undefined
     *
     * @var string
     */
    public $applicationName;

    // 应用所属的产品的产品码
    /**
     * @example undefined
     *
     * @var string
     */
    public $productCode;
    protected $_name = [
        'applicationName' => 'application_name',
        'productCode'     => 'product_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Application
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['application_name'])) {
            $model->applicationName = $map['application_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
