<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ApplicationMeta extends Model
{
    // 产品名称
    /**
     * @example acimacore
     *
     * @var string
     */
    public $name;

    // 应用code
    /**
     * @example aciamcore
     *
     * @var string
     */
    public $code;

    // 应用版本
    /**
     * @example 1.1.1
     *
     * @var string
     */
    public $version;

    // 所属产品code
    /**
     * @example IAM
     *
     * @var string
     */
    public $productCode;

    // 应用之间的依赖
    /**
     * @example
     *
     * @var string[]
     */
    public $dependencies;

    // 应用类型    STANDARD("standard"),
    // JOB("job"),
    // SIDECAR("sidecar"),
    // DAEMON("daemon");
    /**
     * @example standard
     *
     * @var string
     */
    public $kind;
    protected $_name = [
        'name'         => 'name',
        'code'         => 'code',
        'version'      => 'version',
        'productCode'  => 'product_code',
        'dependencies' => 'dependencies',
        'kind'         => 'kind',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('kind', $this->kind, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->dependencies) {
            $res['dependencies'] = $this->dependencies;
        }
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['dependencies'])) {
            if (!empty($map['dependencies'])) {
                $model->dependencies = $map['dependencies'];
            }
        }
        if (isset($map['kind'])) {
            $model->kind = $map['kind'];
        }

        return $model;
    }
}
