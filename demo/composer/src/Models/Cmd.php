<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class Cmd extends Model
{
    // cmd编码
    /**
     * @example SC-RealEstate-Query
     *
     * @var string
     */
    public $cmdCode;

    // 版本号
    /**
     * @example test_d19bd9d59915
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'cmdCode' => 'cmd_code',
        'version' => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('cmdCode', $this->cmdCode, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cmdCode) {
            $res['cmd_code'] = $this->cmdCode;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cmd
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cmd_code'])) {
            $model->cmdCode = $map['cmd_code'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
