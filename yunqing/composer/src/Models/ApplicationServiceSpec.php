<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ApplicationServiceSpec extends Model
{
    // 服务域名
    /**
     * @example
     *
     * @var string[]
     */
    public $domain;

    // 服务名称
    /**
     * @example sre
     *
     * @var string
     */
    public $name;

    // 服务端口
    /**
     * @example
     *
     * @var int
     */
    public $port;

    // 服务协议，http，tcp
    /**
     * @example tcp
     *
     * @var string
     */
    public $protocol;
    protected $_name = [
        'domain'   => 'domain',
        'name'     => 'name',
        'port'     => 'port',
        'protocol' => 'protocol',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('protocol', $this->protocol, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationServiceSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['domain'])) {
            if (!empty($map['domain'])) {
                $model->domain = $map['domain'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }

        return $model;
    }
}
