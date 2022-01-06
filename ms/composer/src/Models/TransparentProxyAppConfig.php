<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyAppConfig extends Model
{
    // 黑名单配置
    /**
     * @example
     *
     * @var TransparentProxyRuleConfig
     */
    public $blacklist;
    protected $_name = [
        'blacklist' => 'blacklist',
    ];

    public function validate()
    {
        Model::validateRequired('blacklist', $this->blacklist, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blacklist) {
            $res['blacklist'] = null !== $this->blacklist ? $this->blacklist->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyAppConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['blacklist'])) {
            $model->blacklist = TransparentProxyRuleConfig::fromMap($map['blacklist']);
        }

        return $model;
    }
}
