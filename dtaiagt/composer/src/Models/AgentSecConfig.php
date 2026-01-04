<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AgentSecConfig extends Model
{
    // 是否打开安全审核
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableSecCheck;

    // 安全提供方:平台配置 大安全、天鉴等
    /**
     * @example 1
     *
     * @var string
     */
    public $secProvider;
    protected $_name = [
        'enableSecCheck' => 'enable_sec_check',
        'secProvider'    => 'sec_provider',
    ];

    public function validate()
    {
        Model::validateRequired('enableSecCheck', $this->enableSecCheck, true);
        Model::validateRequired('secProvider', $this->secProvider, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enableSecCheck) {
            $res['enable_sec_check'] = $this->enableSecCheck;
        }
        if (null !== $this->secProvider) {
            $res['sec_provider'] = $this->secProvider;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentSecConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enable_sec_check'])) {
            $model->enableSecCheck = $map['enable_sec_check'];
        }
        if (isset($map['sec_provider'])) {
            $model->secProvider = $map['sec_provider'];
        }

        return $model;
    }
}
