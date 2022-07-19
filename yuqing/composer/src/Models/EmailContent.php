<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class EmailContent extends Model
{
    // code
    /**
     * @example ant_dtech_saas
     *
     * @var string
     */
    public $serviceCode;

    // 开发者Id
    /**
     * @example developer_id
     *
     * @var string
     */
    public $developerId;

    // 邮箱
    /**
     * @example 94xx@qq.com
     *
     * @var string
     */
    public $email;

    // 参数
    /**
     * @example
     *
     * @var Pair[]
     */
    public $arguments;
    protected $_name = [
        'serviceCode' => 'service_code',
        'developerId' => 'developer_id',
        'email'       => 'email',
        'arguments'   => 'arguments',
    ];

    public function validate()
    {
        Model::validateRequired('email', $this->email, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->developerId) {
            $res['developer_id'] = $this->developerId;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
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
     * @return EmailContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['developer_id'])) {
            $model->developerId = $map['developer_id'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
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
