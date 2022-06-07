<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SmsContent extends Model
{
    // 模板
    /**
     * @example ant_dtech_saas
     *
     * @var string
     */
    public $serviceCode;

    // 手机号
    /**
     * @example 1881066XXXX
     *
     * @var string
     */
    public $mobile;

    // 开发者ID
    /**
     * @example developer_id
     *
     * @var string
     */
    public $developerId;

    // 填充内容
    /**
     * @example arguments
     *
     * @var Pair[]
     */
    public $arguments;
    protected $_name = [
        'serviceCode' => 'service_code',
        'mobile'      => 'mobile',
        'developerId' => 'developer_id',
        'arguments'   => 'arguments',
    ];

    public function validate()
    {
        Model::validateRequired('mobile', $this->mobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->developerId) {
            $res['developer_id'] = $this->developerId;
        }
        if (null !== $this->arguments) {
            $res['arguments'] = [];
            if (null !== $this->arguments && \is_array($this->arguments)) {
                $n = 0;
                foreach ($this->arguments as $item) {
                    $res['arguments'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmsContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['developer_id'])) {
            $model->developerId = $map['developer_id'];
        }
        if (isset($map['arguments'])) {
            if (!empty($map['arguments'])) {
                $model->arguments = [];
                $n                = 0;
                foreach ($map['arguments'] as $item) {
                    $model->arguments[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
